public final class ImmutableClass {
    private final int value;

    public ImmutableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public static void main(String[] args) {
        ImmutableClass immutableObject = new ImmutableClass(10);
        System.out.println("Immutable value: " + immutableObject.getValue());
    }
    
}
