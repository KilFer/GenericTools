# GenericTools

- _com.nonameproject.librarytools.avltree_ : Implementation of a AVLTree.
    - Changes done from the HashCode2020 implementation:
        - Node now has an unique ID and can contain an Object.
        - AVLTree can be informed if the tree accepts duplicates.
        - Can call Insert with only the weight or with the id & object inside the node.
        - Can call Delete with the weight and the ID of the node to delete.
        - Can call getMinValue && getMaxValue of the tree.
    - TODO: 
        - updateNode (update the Object inside a node knowing pId and Value)
        - getNode with Node.Id (optional?) and Node.weigth.
        - deleteNode with Node.Object (Slow method!)
        - getNode with node.object? (Slow Method!)
        - Check if every new implementation works as intended (update TestAVLTree)