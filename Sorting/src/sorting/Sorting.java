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

        list.data.forEach(d -> {

            d = Math.random() * 100;
        });

        Window2D.background = Color4.BLACK;

        Core.render.onEvent(() -> {

            for (int i = 0; i < list.data.size(); i++) {

                Graphics2D.fillRect(
                        Window2D.viewSize.divide(new Vec2(list.data.size(), 100)
                                .multiply(new Vec2(1, (double) list.data.get(i)))),
                        Vec2.ZERO, Color4.WHITE
                );

            }
            
            Graphics2D.fillRect(Vec2.ZERO, new Vec2(500), Color4.RED);
        });

        Core.timer(1000, () -> list.sort(Sortable.BUBBLE_SORT, Sortable.LEAST_TO_GREATEST));

        Core.run();
    }

}
