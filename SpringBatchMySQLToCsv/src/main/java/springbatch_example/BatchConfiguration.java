package springbatch_example;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springbatch_model.ReportPojo;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	public DataSource dataSource;
	
	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/hib");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	@Bean
	public JdbcCursorItemReader<ReportPojo> reader() {
		JdbcCursorItemReader<ReportPojo> reader = new JdbcCursorItemReader<ReportPojo>();
		reader.setDataSource(dataSource);
		reader.setSql("select Join_Date,Id,Name,Department,Age from employee_report");
		reader.setRowMapper(new ReportPojoRowMapper());
		
		
		return reader;
	}
		
		public class ReportPojoRowMapper implements RowMapper<ReportPojo> {

			@Override
			public ReportPojo mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				ReportPojo rp = new ReportPojo();
				
				rp.setJoin_Date(rs.getString("Join_Date"));
				rp.setId(rs.getString("Id"));
				rp.setName(rs.getString("Name"));
				rp.setDepartment(rs.getString("Department"));
				rp.setAge(rs.getString("Age"));
				
				
				return rp;
			}
			
		}
		
		
		public ReportPojoItemProcessor processor() {
			return new ReportPojoItemProcessor();
		}
		
		@Bean
		public FlatFileItemWriter<ReportPojo> writer() {
			FlatFileItemWriter<ReportPojo> writer = new FlatFileItemWriter<ReportPojo>();
			writer.setResource(new ClassPathResource("reportpojo.csv"));
			writer.setLineAggregator(new DelimitedLineAggregator<ReportPojo>(){{
			setDelimiter(",");
		
			setFieldExtractor(new BeanWrapperFieldExtractor<ReportPojo>() {{
				setNames(new String[] { "Join_Date", "Id", "Name", "Department", "Age" });
				
				}});
		}});
			return writer;
		
	}
		@Bean 
		public Step step1() {
			return stepBuilderFactory.get("step1").<ReportPojo,ReportPojo> chunk(10)
					.reader(reader())
					.processor(processor())
					.writer(writer())
					.build();
		
		}
		@Bean
		public Job exportReportPojoJob() {
			
			
			return jobBuilderFactory.get("exportReportPojoJob")
					.incrementer(new RunIdIncrementer())
					.flow(step1())
					.end()
					.build();
			
		}
		
		
		
}
	
	


