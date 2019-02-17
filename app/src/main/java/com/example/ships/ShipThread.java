package com.example.ships;

public class ShipThread implements Runnable{
    private String name;
    private int boxes = 10;

    public ShipThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Working on " + name);

        int left = 10;

        for (int i=0; i<boxes; i++){
            System.out.println("Boxes left: " + left);

            left--;

            try{
               Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (left == 0){
            System.out.println("Work finished");
        }
    }
}
