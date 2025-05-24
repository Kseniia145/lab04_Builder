public class StringBuilderCustom implements Builder {
    private StringBuilder internalBuilder;

    public StringBuilderCustom() {
        this.internalBuilder = new StringBuilder();
    }

    @Override
    public Builder append(String str) {
        internalBuilder.append(str);
        return this;
    }

    @Override
    public Builder insert(int index, String str) {
        if (index < 0 || index > internalBuilder.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        internalBuilder.insert(index, str);
        return this;
    }

    @Override
    public String build() {
        return internalBuilder.toString();
    }
}
