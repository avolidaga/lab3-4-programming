package com.company;

public class Knowles extends Shorty implements KnowlesActions {

    public Knowles(){
        super("Знайка");
    }
    public class TheInnerVoice {
        public void spell() {
            System.out.println(" Так мне, дураку, и надо! мысленно подумал Знайка\n - Не мог держать язык за зубами - теперь расплачивайся!");
        }
    }

    @Override
    public void LightUpElectro(Mood mood) {
        boolean light;
        if (mood == Mood.SHAME){
            System.out.println(getName() + " нарочно не зажег электричество, так как ему стыдно было смотреть коротышкам в " + PartOfTheBody.EYES + ".");
            light = false;
        }
        else {
            System.out.println(getName() + " просто зажег электричество");
            light = true;
        }
    }

    @Override
    public void Burrow(boolean light, int numberShorty) {
        if (light == false & numberShorty == 0) {
            System.out.println(getName() + " с размаху бросился на кровать, зарылся " + PartOfTheBody.FACE + " в подушку.");
        }
        else {
            System.out.println(getName() + " ничего не сделал.");
        }
    }

    @Override
    public void Embrace() {
        System.out.println("И обхватил " + PartOfTheBody.HEAD + " " + PartOfTheBody.ARMS + ".");
    }

}
