package org.lang;


public class StateDetails extends LanguageInfo{

	public static void main(String[] args) {
		LanguageInfo lang = new LanguageInfo();
		StateDetails state = new StateDetails();
		state.southIndia();
		state.northIndia();
		state.tamilLanguage();
		state.englishLanguage();
		state.hindiLanguage();
		
	}
	
	
	public void southIndia() {
		System.out.println("This is South");
	}
	
	public void northIndia() {
		System.out.println("This is North");
	}
	
	
}
