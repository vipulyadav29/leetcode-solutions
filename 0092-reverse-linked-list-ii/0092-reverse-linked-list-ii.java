class Solution {
    public ListNode reverseBetween(ListNode h,int l,int r){
        if(h==null||l==r)return h;
        ListNode d=new ListNode(0,h),p=d;
        for(int i=1;i<l;i++)p=p.next;
        ListNode c=p.next,n;
        for(int i=0;i<r-l;i++){
            n=c.next;
            c.next=n.next;
            n.next=p.next;
            p.next=n;
        }
        return d.next;
    }
}