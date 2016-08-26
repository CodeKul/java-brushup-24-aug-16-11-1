package com.codekul.brushup.innerclasses;

/**
 * Created by aniruddha on 26/8/16.
 */
public class Outer {

    private int outerInt;

    public void setOuterInt(int outerInt){
        this.outerInt = outerInt;

        class LocalInner {

        }

        LocalInner inner = new LocalInner();
    }

    public class SimpleInner {
        private int intInner; // not accessible to outer

        public SimpleInner() {
            outerInt = 10;
        }
    }

    public static class StaticInner {
    }
}
