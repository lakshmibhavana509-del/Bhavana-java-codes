public class NeedleInHaystack {
    public static void main(String[] args) {
        String haystack = "This is the haystack where we look for the needle.";
        String needle = "needle";

        int index = haystack.indexOf(needle);

        if (index != -1) {
            System.out.println("Needle found at position: " + index);
        } else {
            System.out.println("Needle not found in the haystack.");
        }
    }
}
