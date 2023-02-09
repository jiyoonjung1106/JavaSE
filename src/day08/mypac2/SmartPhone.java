package day08.mypac2;

import day08.mypac.CellPhone;

public class SmartPhone extends CellPhone {
		private String model;
	
		public SmartPhone() {
			this.model = "스마트폰";
		}
		
		public void internet() {
			System.out.println("인터넷을 해요.");
		}
		
		public void videoMessage() {
			System.out.println("영상 문자보내기");
			sendMessage();
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}
		
}
