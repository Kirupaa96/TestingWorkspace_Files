import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

public class Example {

	public static void main() {
//		getValue("date-");
	}
	
	private  CharSequence getValue(String raw_data) {
		String formattedData = null;
		
		if(raw_data.contains("date-")) {
			String month = raw_data.split("-")[1];
			int month_num = Integer.parseInt(month);
			LocalDate date = LocalDate.now().minusMonths(month_num);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			formattedData = date.format(formatter);
		}
		
		if(raw_data.contains("date+")) {
			String month = raw_data.split("+")[1];
			int month_num = Integer.parseInt(month);
			LocalDate date = LocalDate.now().plusMonths(month_num);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			formattedData = date.format(formatter);
		}
		
		return formattedData;
	}
	
	/*
	public void method() {
		
		int size = 50; 
		
		for(int j=2; j<=size+1; j++) {
			
		LinkedHashMap<String,String> row = new LinkedHashMap<>();
		for(int i=1; i<=25; i++) {
		
			String xpath = null; 
			if(i==1 || i==2) {
				xpath = wc.getPropertyFromObjectRepo("ltd_cellData").replace("@param_j@",j+"").replace("@param_i@",i+"");
			}
			else {
				xpath = wc.getPropertyFromObjectRepo("xpath_cellData").replace("@param_j@",j+"").replace("@param_i@",i+"");
			}
			
			Webelement ele = wc.getDriver().findElement(By.xpath(xpath));
			builder.moveToElement(ele).build().perform();
			String value = ele.getText();
			
			if(i==3||i==4||i==5||i==6||i==7||i==8||i==9||i==10||i==11||i==12||i==13||i==14||i==15||i==17) {
				
				
				if(value.contains(",")) {
					String value1 = value.replace(",", "");
					double number = Double.parseDouble(value1);
					String crctValue = String.format("%.2f", number);
					row.put(headers.get(i), crctValue);
					builder.sendkeys(keys.TAB).perform();
				}
				else {
					double number = Double.parseDouble(value1);
					String crctValue = String.format("%.2f", number);
					row.put(headers.get(i), crctValue);
					builder.sendkeys(keys.TAB).perform();
				}
			}
			
			if(i==16) {
				if(value.contains("%")) {
					String value1 = value.replace(",", "");
					double number = Double.parseDouble(value1);
					String crctValue = String.format("%.2f", number);
					row.put(headers.get(i), crctValue);
					builder.sendkeys(keys.TAB).perform();
				}
			}
			
			else {
				row.put(headers.get(i), value);
				builder.sendkeys(Keys.TAB).perform();
		 		}
		}
			tableData.put(j-1, row);
		}
		
		
		
		
		
		
		
	}
	*/
}





  














