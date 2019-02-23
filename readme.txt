SessionFactory 对象
    配置对象被用于创造一个 SessionFactory 对象，使用提供的配置文件为应用程序依次配置 Hibernate，并允许实例化一个会话对象。
    SessionFactory 是一个线程安全对象并由应用程序所有的线程所使用。
    SessionFactory 是一个重量级对象所以通常它都是在应用程序启动时创造然后留存为以后使用。
    每个数据库需要一个 SessionFactory 对象使用一个单独的配置文件。所以如果你使用多种数据库那么你要创造多种 SessionFactory 对象。
Session 对象
    一个会话被用于与数据库的物理连接。Session 对象是轻量级的，并被设计为每次实例化都需要与数据库的交互。持久对象通过 Session 对象保存和检索。
    Session 对象不应该长时间保持开启状态因为它们通常情况下并非线程安全，并且它们应该按照所需创造和销毁。
Transaction 对象
    一个事务代表了与数据库工作的一个单元并且大部分 RDBMS 支持事务功能。在 Hibernate 中事务由底层事务管理器和事务（来自 JDBC 或者 JTA）处理。
    这是一个选择性对象，Hibernate 应用程序可能不选择使用这个接口，而是在自己应用程序代码中管理事务。
Query 对象
    Query 对象使用 SQL 或者 Hibernate 查询语言（HQL）字符串在数据库中来检索数据并创造对象。一个查询的实例被用于连结查询参数，限制由查询返回的结果数量，并最终执行查询。
Criteria 对象
    Criteria 对象被用于创造和执行面向规则查询的对象来检索对象。
Hibernate 的前提(依赖):
    1   dom4j - XML 解析 www.dom4j.org/
    2	Xalan - XSLT 处理器 http://xml.apache.org/xalan-j/
    3	Xerces - The Xerces Java 解析器 http://xml.apache.org/xerces-j/
    4	cglib -Java 类生成库http://cglib.sourceforge.net/
    5	log4j - 日志控制 http://logging.apache.org/log4j
    6	Commons - 日志，邮件等 http://jakarta.apache.org/commons
    7	SLF4J - 简单日志门面 http://www.slf4j.org
Hibernate 属性
    1	hibernate.dialect
        这个属性使 Hibernate 应用为被选择的数据库生成适当的 SQL。
    2	hibernate.connection.driver_class
        JDBC 驱动程序类。
    3	hibernate.connection.url
        数据库实例的 JDBC URL。
    4	hibernate.connection.username
        数据库用户名。
    5	hibernate.connection.password
        数据库密码。
    6	hibernate.connection.pool_size
        限制在 Hibernate 应用数据库连接池中连接的数量。
    7	hibernate.connection.autocommit
        允许在 JDBC 连接中使用自动提交模式。