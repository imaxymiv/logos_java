package com.test11.www;

import java.util.ArrayList;

/**
 * Created by Ivan on 4/13/2016.
 */
public class MyCollection {

    Object[] x = new Object[5];

    class MyCollectionInner implements MyIterator {
        Object[] y = x;

        @Override
        public boolean hasNext() {
            for (int i = 0; i < y.length; i++) {
                if (y[i] == null) {
                    return false;
                }
            }
            return true;
        }

        /*public boolean hasNext(int u) {
            for (int u = 0; u < y.length; u++) {
                if (y[u] == null) {
                    return false;
                }
            }
            return true;
        }*/

        @Override
        public void next() {
            int x = 0;
            while (hasNext()) {
                //if (hasNext() != false) {
                System.out.println(y[x]);
                x++;
                }
            //}
        }

    }
}
