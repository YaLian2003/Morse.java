public class Morse {
    public static void main(String[] args) {
        MCTree mcTree = new MCTree();

        // A) Encode "Hello World"
        String encoded = mcTree.encode("Hello World");
        System.out.println("Encoded: " + encoded);

        // B) Decode "...---..."
        String decoded = mcTree.decode("...---...");
        System.out.println("Decoded: " + decoded);

        // C) Perform tree traversals
        System.out.println("Preorder Traversal:");
        mcTree.preorderTraverse();
        System.out.println("\nInorder Traversal:");
        mcTree.inorderTraverse();
        System.out.println("\nPostorder Traversal:");
        mcTree.postorderTraverse();
    }
}
