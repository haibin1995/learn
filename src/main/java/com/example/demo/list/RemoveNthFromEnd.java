package com.example.demo.list;

import com.example.demo.list.MiddleNode.ListNode;

/**
 * @author: YJY
 * @date: 2021/9/27 16:27
 * @description: 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthFromEnd {

  public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   /**
   * @Description 快慢指针 先让快指针到达指定位置 然后 循环挪动直到最后
   **/
  public ListNode removeNthFromEnd(ListNode head, int n) {

    //记录头结点 因为要返回头结点 自己定位一个头结点
    ListNode dummy = new ListNode(0, head);
    ListNode first = head;
    ListNode second = dummy;
    //先让快节点到达指定位置
    for (int i = 0; i < n; ++i) {
      first = first.next;
    }
    while (first != null) {
      first = first.next;
      second = second.next;
    }
    //找到位置后 覆盖(即删除)
    second.next = second.next.next;
    //处理完数据后 返回除了自己定义的头结点以外的数据即可
    ListNode ans = dummy.next;
    return ans;
  }



}
