package springbatch_example;

import org.springframework.batch.item.ItemProcessor;

import springbatch_model.ReportPojo;

public class ReportPojoItemProcessor implements ItemProcessor<ReportPojo, ReportPojo> {
	
	@Override
	public ReportPojo process(ReportPojo reportpojo) throws Exception {
		return reportpojo;
		
	}

}
