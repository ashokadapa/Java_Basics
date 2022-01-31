package javaPrograms;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// year input
    		Scanner scann = new Scanner(System.in);
    		System.out.println("Enter Year");
    		int targetYear = 0;
    		String yearin = (Integer.toString(targetYear));
    		yearin = scann.nextLine();
    		// month input
    		System.out.println("Enter month");
    		int targetMonth = 0;
    		String monthin = (Integer.toString(targetMonth));
    		monthin = scan.nextLine();
    		// day input
    		System.out.println("Enter day");
    		int targetDay = 0;
    		String Dayin = (Integer.toString(targetDay));
    		Dayin = scan.nextLine();
    		Object tablecontent = webdriver.findElements(By.xpath("//*[@class='mat-calendar-table']/tbody"));
    		a: do {
    			// year selection
    			List<WebElement> allyears = webdriver
    					.findElements(By.xpath("//*[@class='mat-calendar-table']/tbody/tr/td/div"));
    			System.out.println(allyears.size());
    			Thread.sleep(3000);
    			WebElement lastyear = webdriver
    					.findElement(By.xpath("(//*[@class='mat-calendar-table']/tbody/tr/td/div)[24]"));
    			String S = lastyear.getText();
    			System.out.println(S);
    			for (WebElement ele1 : allyears) {
    				String e = ele1.getText();
    				System.out.println(e);
    				System.out.println("yearin = " + yearin);
    				if (e.equals(yearin)) {
    					ele1.click();
    					scenario.write("Selection of Required Year Test Passed");
    					// month selection
    					List<WebElement> months = webdriver
    							.findElements(By.xpath("//*[@class='mat-calendar-table']/tbody/tr/td/div"));
    					Thread.sleep(3000);
    					int s = months.size();
    					System.out.println("INT Month : " + s);
    					Object tabelBodyMonthData = webdriver
    							.findElement(By.xpath("//*[@class='mat-calendar-table']/tbody/tr/td/div"));
    					if (tabelBodyMonthData != null) {
    						for (WebElement monthElement : months) {
    	 						String month = monthElement.getText();
    	 						System.out.println("month = "+month);
    							if (month.equalsIgnoreCase(monthin)) {
    								monthElement.click();
    								System.out.println("MonthInput : " + month);
    								scenario.write("Selection of Required Month Test Passed");
    								// day selection
    								List<WebElement> days = webdriver
    										.findElements(By.xpath("//*[@class='mat-calendar-table']/tbody/tr/td/div"));
    								Thread.sleep(3000);
    								int day = days.size();
    								System.out.println("INT day : " + day);
    								Object tabelBodyDaysData = webdriver
    										.findElement(By.xpath("//*[@class='mat-calendar-table']/tbody"));
    								if (tabelBodyDaysData != null) {
    									for (WebElement dayElement : days) {
    										String m = dayElement.getText();
    										if (m.equals(Dayin)) {
    											dayElement.click();
    											System.out.println("DayInput : " + m);
    											scenario.write("Selection of Required date Test Passed");
    											break a;
    										}
    									}
    								}
    							}
    						}
    					}
    					
    					else if (S.equals(e) && e != yearin) {
    					System.out.println(S);
    					System.out.println(e);
    					System.out.println(yearin);
    					int Target = Integer.parseInt(yearin);
    					if ((S.equals(e) && e != yearin && Target > jumYearBy)) {
    						System.out.println(S);
    						Thread.sleep(3000);
    						wait.until(ExpectedConditions.elementToBeClickable(backgroundcheck.forward));
    					backgroundcheck.forward.click();
    						scenario.write("Year greater than input year click on forward button test passed");
    						break;
    					} else if (S.equals(e) && e != yearin && (Target < jumYearBy)) {
    						System.out.println(S);
    						Thread.sleep(3000);
    						wait.until(ExpectedConditions.elementToBeClickable(backgroundcheck.backward));
    					backgroundcheck.backward.click();
    						scenario.write("Year less than input year click on backward button test passed");
    						break;
    					}
    				}
    			}
    		} 
	}

}
