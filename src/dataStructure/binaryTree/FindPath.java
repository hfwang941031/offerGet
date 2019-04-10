package dataStructure.binaryTree;

import java.util.ArrayList;

/**
 * @ClassName FindPath
 * @Description
 * 输入一颗二叉树的跟节点和一个整数，
 * 打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 *
 * 注意：题目里要求必须是到达叶子节点才可以，即路径的最后应该是叶子节点
 *
 *
 * 思路：首先整体需要用到递归所以不适合在具体函数里面定义存储容器，否则每次递归到函数开头，
 * 都会新建一个容器，所以把容器定义到了函数体外
 * 从根节点开始遍历，先把结点添加到当前容器，把目标值减去结点值，判断当前目标值是不是为0，
 * 并且该节点到达了叶子节点。如果是的话，也就是找到了一条当前路径，需要把该路径添加到list集合中
 * 接下来递归调用分别去找根节点的左右孩子结点
 *
 * 最后回退原因如下：递归到叶子节点如果还没有找到路径，就要回退到父节点继续寻找，依次类推
 *
 * @Author 王海峰
 * @Date 2019/4/1 8:52
 * @Version 1.0
 */
public class FindPath {

    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {

        if (root == null) {
            return listAll;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            listAll.add(new ArrayList<>(list));
        }
        findPath(root.left, target);
        findPath(root.right, target);
        list.remove(list.size() - 1);
        return listAll;
    }
}
