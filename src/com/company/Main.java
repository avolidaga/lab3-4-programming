package com.company;

		public class Main {

			public static void main(String[] args) {
				Knowles knowles = new Knowles();
				Knowles.TheInnerVoice theInnerVoice = knowles.new TheInnerVoice();

				SunCity sunCity = new SunCity();
				SunCity.Room room = new SunCity.Room();
				Shorty shorty = new Shorty();
				Shorty tackle = new Shorty(){
					public void EngageInConversation(){
						System.out.println("- Ну, ты не горюй,  чего  там!  Завтра  мы  снова  придем,  -  сказал Шпунтик.");
					}
				};
				tackle.EngageInConversation();
				shorty.EngageInConversation();
				room.Status();
				try {
					sunCity.Happens(Mood.HAPPY, false);
				} catch (ImpossibleNumberShortyException e){
					System.err.println(e.getMessage());
					System.err.println("Их больше 2? Нет!");
				}
				knowles.LightUpElectro(Mood.SHAME);
				knowles.Burrow(false,0);
				knowles.Embrace();
				theInnerVoice.spell();
				room.shining();
    }
}
