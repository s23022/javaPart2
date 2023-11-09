package chapter7_6;

public class Joining {
    private String csv;
    private String delimiter;

    public Joining(String csv, String delimiter) {
        this.csv = csv;
        this.delimiter = delimiter;
    }

    public Joining(String delimiter) {
        this.csv = "";
        this.delimiter = delimiter;
    }

    public Joining() {
        this.csv = "";
        this.delimiter = ",";
    }

    public void add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
    }

    public String getCsv() {
        return csv;
    }

    public static void main(String[] args) {
        chapter7_2.Joining j = new chapter7_2.Joining("", ",");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
    }
}
