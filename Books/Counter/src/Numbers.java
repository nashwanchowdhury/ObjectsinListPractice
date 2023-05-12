public class Numbers {
    int startvalues;

    public Numbers(int startvalue) {
        this.startvalues = startvalue;
    }

    public Numbers() {
        this.startvalues = 0;
    }

    public void value() {
        System.out.println(startvalues);
    }

    public void increase() {
        startvalues++;
    }

    public void decrease() {
        startvalues--;
    }

    public void decreaseBy(int x) {
        if (x < 0) {

        } else {
            startvalues = startvalues - x;
        }
    }
        public void increaseBy(int x) {
            if (x < 0) {
                return;
            } else {
                startvalues = startvalues + x;
            }
        }

    }


