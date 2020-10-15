## 如何把一个项目同时同步在`GitHub`和`Gitee`上?

### 先做点铺垫, 以本地创建一个项目然后关联到远程仓库为例:

1. 现有本地项目`demo`
2. 然后在`Gitee`上新建一个仓库, 仓库名与`demo`保持同名
3. 使用命令`git remote add origin git@gitee.com:zzz/demo.git`进行本地仓库与远程仓库的关联
4. 对于上面的步骤, 我们一定要了解, `origin`就是我们远程的一个标识, 本地`demo`, 远程`origin/demo`
5. 可以使用命令`git remote -v`查看, 或者也可以直接登录`Gitee`查看

### 下面已已经同步到`Gitee`的`demo`工程为例, 演示如何将`demo`同时同步到GitHub和`Gitee`

1. 先删除关联远程的仓库, 命令如下: `git remote rm origin`, 这里的额`origin`就是上面说的那个远程的标识
2. 关联Gitee的远程仓库, 命令如下: `git remote add gitee git@gitee.com:zzz/demo.git`, 这里使用`gitee`作为远程标识
3. 关联GitHub的远程仓库, 命令如下: `git remote add github git@github.com:zzz/demo.git`, 这里使用`github`作为远程标识, 并且与`gitee`区分开来
4. 插播一个注意事项, 对`2`和`3`步, 需要提前保证`GitHub`或`Gitee`已经建立了名为`demo`的仓库
5. 可以查看demo工程下`.git/config`文件, 应该会看得到2条`remote`信息, 分别对应`github`和`gitee`
6. 也可以先使用命令`git remote -v`查看, 内容大概如下:
```
git remote -v
gitee	git@gitee.com:zzz/demo.git (fetch)
gitee	git@gitee.com:zzz/demo.git (push)
github	git@github.com:zzz/demo.git (fetch)
github	git@github.com:zzz/demo.git (push)
```

接下来就是push和pull操作了:
```
git push <origin_name> <branch_name>
```
* git push github master 
* git push gitee master


参考资料:
* https://www.liaoxuefeng.com/wiki/896043488029600/1163625339727712
* https://gitee.com/help