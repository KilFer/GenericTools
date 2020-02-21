package com.nonameproject.librarytools.avltree.example;

import com.nonameproject.librarytools.avltree.AVLTree;
import com.nonameproject.librarytools.avltree.Node;

import java.io.*;

public class TestAVLTree {
    private static long treeElements = 10;

    public static void main(String args[]) throws IOException
    {
        File file = new File("src/output/out");
        BufferedWriter wr = null;
        AVLTree t = new AVLTree(true);
        Node root = null;
        long startTime = System.currentTimeMillis();
        long x = 0;
        for (x = 0; x < treeElements; x++)
        {
            Node rootprov = t.insert(root, x);
            if
            (rootprov != null) {
                root = rootprov;
            }
        }
        System.out.println("Tiempo empleado en milisegundos : " + (System.currentTimeMillis() - startTime));
        while (true)
        {
            System.out.println("MAX VALUE: " + AVLTree.getMaxValue(root).weight);
            System.out.println("(1) Insert");
            System.out.println("(2) Delete");
            System.out.println("(3) List values");
            System.out.println("(4) Output print");

            try
            {
                BufferedReader bufferRead = new BufferedReader(
                        new InputStreamReader(System.in));
                String s = bufferRead.readLine();

                if (Integer.parseInt(s) == 1)
                {
                    System.out.print("Value to be inserted: ");
                    root = t.insert(root,
                            Integer.parseInt(bufferRead.readLine()));
                }
                else if (Integer.parseInt(s) == 2)
                {
                    System.out.print("Value to be deleted: ");
                    root = t.deleteNode(root,
                            Integer.parseInt(bufferRead.readLine()));
                }
                else if (Integer.parseInt(s) == 3)
                {
                    AVLTree.listValues(root);
                    System.out.println("fin");
                }
                else if (Integer.parseInt(s) == 4)
                {
                    startTime = System.currentTimeMillis();
                    wr = new BufferedWriter(new FileWriter(file));
                    AVLTree.writeToFile(root, wr);
                    System.out.println("Tiempo empleado en milisegundos : " + (System.currentTimeMillis() - startTime));
                    wr.close();
                }
                else if (Integer.parseInt(s) == 5)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid choice, try again!");
                    continue;
                }
                if (x < 101)
                    t.print(root);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
