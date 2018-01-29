# 基于翔的代码修改的recycleview的comenadapter
 
 
 一种类型
       
        recycle.setAdapter(new CommenAdapter(this,list)
                        .addItemViewDelegate(new ItemViewDelegate<MessageBean>(R.layout.item_message1) {
                            @Override
                            public void convert(ViewHolder holder, MessageBean o, int position) {
                                holder.setText(R.id.tv_message,o.getBody());
                            }
                        }));
    ```
 多种种类型
    
        recycle.setAdapter(new CommenAdapter(this,list)
                        .addItemViewDelegate(1,new ItemViewDelegate<MessageBean>(R.layout.item_message1) {
                            @Override
                            public void convert(ViewHolder holder, MessageBean o, int position) {
                                holder.setText(R.id.tv_message,o.getBody());
                            }
                        })
                        .addItemViewDelegate(2,new ItemViewDelegate<MessageBean>(R.layout.item_message1) {
                            @Override
                            public void convert(ViewHolder holder, MessageBean o, int position) {
                                holder.setText(R.id.tv_message,o.getBody());
                            }
                        })
                );
    
 
  通常列表单个类型布局可以程序全局复用
 
        recycle.setAdapter(new CommenAdapter(this, list)
                        .addItemViewDelegate(new ItemViewDelegate() {
                            @Override
                            public void convert(ViewHolder holder, Object o, int position) {
                                
                            }
                        }));
  但是建议用dagger注入
    
        @Inject
            Lazy<MessageItemViewDelegate> mMessageItemViewDelegate;
            
        recycle.setAdapter(new CommenAdapter(this, list)
                        .addItemViewDelegate(mMessageItemViewDelegate.get()));
 支持列表itemview布局使用databinding，viewholder的范型可以为databinding对象
 。并且支持和非范型viewholder一起使用于一个adapter中。比如其中一个item(你可以不用dagger)：
 
 
        public class MessageItemViewDelegate extends ItemViewDelegateDataBinding<MessageBean,ItemMessageBinding> {
            @Inject
            public MessageItemViewDelegate() {
                super(R.layout.item_message);
            }
        
            @Override
            public void convertDataBinding(ViewHolder<ItemMessageBinding> holder, MessageBean messageBean, int position) {
                holder.getBinding().setMessage(messageBean);
            }
        }
        