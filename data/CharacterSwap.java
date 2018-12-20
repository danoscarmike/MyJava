class CharacterSwap {
    public static void main(String[] args) {
        String txt = "";
        if (txt.isEmpty()) txt = "    Borrocudo    ";
        System.out.println("String: " + txt);
        System.out.println(txt.length());
        String trimmed = txt.trim();
        System.out.println("Trimmed string: " + trimmed);
        System.out.println(trimmed.length());
        System.out.println("Starts with: " + trimmed.charAt(0));
        System.out.println("Ends with: " + trimmed.charAt(trimmed.length() -1));
        System.out.println("Edited: " + trimmed.replace("o", "a"));
    }
}