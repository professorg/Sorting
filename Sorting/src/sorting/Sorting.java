/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import engine.Core;
import graphics.Graphics2D;
import graphics.Window2D;
import java.util.ArrayList;
import util.Color4;
import util.Vec2;

/**
 *
 * @author gvandomelen19
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Core.init();

        Window2D.viewPos = Window2D.UR();

        Sortable list = new Sortable(new ArrayList<>());

        for (int i = 0; i < 100; i++) {
            
            list.data.add(Math.random()*100);
        }

        Window2D.background = Color4.BLACK;

        Core.render.onEvent(() -> {

            for (int i = 0; i < list.data.size(); i++) {

                Graphics2D.fillRect(
                        new Vec2(i * Window2D.viewSize.x / list.data.size(),0),
                        new Vec2(0.9 * Window2D.viewSize.x / list.data.size(), 1.0 * (double) list.data.get(i)), 
                        Color4.WHITE
                );

            }
        });

        Core.timer(1, () -> list.sort(Sortable.BUBBLE_SORT, Sortable.LEAST_TO_GREATEST));

        Core.run();
    }

}
