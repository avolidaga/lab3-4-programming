package com.company;

public class SunCity {
    public static class Room {
        boolean light;
        public void Status(){
            if (light == true){
                System.out.println("В комнате было светло.");
            }
            else{
                System.out.println("В комнате было темно.");
            }
        }
        public void shining(){
            class Stone {
                boolean lightstone = true;
                public void shiningStone(){
                    if (lightstone == true) {
                        System.out.println("На всю комнату ярким светом засветился камень. И запылал он цветом" + ColorOfStone.BRIGHTPINK);
                    } else {
                        System.out.println("Лег спать");
                    }

                }

            }
            Stone stone = new Stone();
            stone.shiningStone();
        }
    }
    public void Happens (Mood mood, boolean light) throws ImpossibleNumberShortyException {
        int numberShorty = (int)(Math.random()*10);
        if (numberShorty > 2 & mood == Mood.HAPPY & light == false){
            System.out.println("Коротышки, их было " + numberShorty + ".");
            System.out.println("Начали выбираться из комнаты, смеясь и наступая друг другу на пятки.");}
        else if (numberShorty == 1 | numberShorty == 2){
            throw new ImpossibleNumberShortyException("Exception:Слишком мало людей в комнате! По рассказу должно быть больше. Коротышек было - " + numberShorty);
        }
        else{
            throw new ZeroException("Zero people can't be in the room");
        }
    }
}
