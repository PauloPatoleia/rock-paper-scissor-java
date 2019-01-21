package org.academiadecodigo.bootcamp22.rockpaperscissors;

public class Random {

        public static int Generate(int n) {

            return (int) Math.floor(Math.random() * n + 1);

        }

}
