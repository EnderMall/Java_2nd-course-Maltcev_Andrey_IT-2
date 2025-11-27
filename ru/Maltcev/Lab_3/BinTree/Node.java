package ru.Maltcev.Lab_3.BinTree;

public class Node {
    private Integer num;
    private Node parent;
    private Node left;
    private Node right;

    public Node() {
        this.num = null;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public void add(int number){
        if (this.num==null){
            this.num=number;
            return;
        }
        if (this.num>number) {
            if (this.left == null) {
                Node temp = new Node();
                temp.parent = this;
                this.left = temp;
            }
            this.left.add(number);
        }
        else{
            if (this.right==null){
                Node temp = new Node();
                temp.parent = this;
                this.right=temp;
            }
            this.right.add(number);
        }
    }

    public void remove(int number){
        Node forRemove = find(number);
        if (forRemove!=null){
            if (forRemove.parent==null&&forRemove.left==null&&forRemove.right==null){
                forRemove.num=null;
                return;
            }
            if (forRemove.left == null && forRemove.right == null) {
                if (forRemove.parent.left == forRemove) {
                    forRemove.parent.left = null;
                } else {
                    forRemove.parent.right = null;
                }
            }
            else if (forRemove.left!=null&& forRemove.right == null){
                if (forRemove.parent.left==forRemove){
                    forRemove.parent.left=forRemove.left;
                }
                else {
                    forRemove.parent.right=forRemove.left;
                }
                forRemove.left.parent=forRemove.parent;

            }
            else if (forRemove.left == null&& forRemove.right != null) {
                if (forRemove.parent.left == forRemove) {
                    forRemove.parent.left = forRemove.right;
                } else {
                    forRemove.parent.right = forRemove.right;
                }
                forRemove.right.parent = forRemove.parent;
            }
            else {
                Node minNode = forRemove.right.findMin();
                forRemove.num = minNode.num;
                forRemove.right.remove(minNode.num);
            }
        }

    }
    private Node find(int number) {
        if (this.num != null && this.num == number) {
            return this;
        }

        if (this.left != null) {
            Node leftRes = this.left.find(number);
            if (leftRes != null) return leftRes;
        }

        if (this.right != null) {
            Node rightRes = this.right.find(number);
            if (rightRes != null) return rightRes;
        }
        return null;
    }
    private Node findMin() {
        Node cur = this;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    public boolean contains(int number) {
        if (this.num != null && this.num == number) {
            return true;
        }

        boolean foundInLeft = (this.left != null) && this.left.contains(number);
        boolean foundInRight = (this.right != null) && this.right.contains(number);

        return foundInLeft || foundInRight;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        inOrderTraversal(result);
        return result.toString().trim();
    }

    private void inOrderTraversal(StringBuilder result) {
        if (this.left != null) {
            this.left.inOrderTraversal(result);
        }

        if (this.num != null) {
            result.append(this.num).append(" ");
        }

        if (this.right != null) {
            this.right.inOrderTraversal(result);
        }
    }
}