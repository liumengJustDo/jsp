package ssm;

import java.util.ArrayList;
import java.util.List;

/*
快捷键的使用
alt+/ 代码自动补全
alt + insert 自动生成构造方法
ctrl+shift+回车 补全结尾
ctrl+j 自动生成代码
-----------------------
代码优化
alt+回车 导包或者是修正导入的包
ctrl+alt+l 格式化代码
 */
public class HelloWorld {


    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        User user2 = new User();
        user1.setUsername("刘艨");
        user2.setUsername("你好");
        user1.setPassword(11);
        user1.setAddress("湖北省鄂州市华容区");
        user2.setPassword(11);
        user2.setAddress("湖北省鄂州市华容区");
        users.add(user1);
        users.add(user2);
        System.out.println(users);


    }

}
