class MyClass implements Cloneable {
    int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            MyClass obj1 = new MyClass(10);
            MyClass obj2 = (MyClass) obj1.clone();  // Now it works
            System.out.println("Clone successful: " + obj2.value);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
