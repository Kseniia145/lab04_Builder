public interface Builder {
    Builder append(String str);
    Builder insert(int index, String str);
    String build();
}
