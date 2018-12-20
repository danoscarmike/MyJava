class StringLength {
    public static void main(String[] args) {
        String txt1 = "Java";
        String txt2 = " in easy steps";
        String title = txt1.concat(txt2);
        System.out.print("\"" + title + "\" has ");
        System.out.println(title.length() + " characters.");
    }  
}