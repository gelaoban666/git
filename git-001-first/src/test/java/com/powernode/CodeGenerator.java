package com.powernode;

import org.junit.Test;

public class CodeGenerator {

    @Test
    public void generate(){
        {
            String table = "sms_custom";
            // 获取父项目路径
            String parent_path = System.getProperty("user.dir");
            System.out.println(parent_path);
//        String entity = parent_path + "/src/main/java/com/example/entity";
//        String mapper = parent_path + "/src/main/java/com/example/mapper";
//        String service = parent_path + "/src/main/java/com/example/service";
//        String service_impl = parent_path + "/src/main/java/com/example/service/serviceImpl";
//        String controller = parent_path + "/src/main/java/com/example/controller";
//        String xml = parent_path + "/src/main/resources/com/example/mapper";
//        // 创建生成器对象
//        AutoGenerator mpg = new AutoGenerator();
//        //创建全局配置对象
//        GlobalConfig gc = new GlobalConfig();
//        gc.setAuthor("xs");
//        //配置生成后不打开文件
//        gc.setOpen(false);
//        // 去掉service的I
//        gc.setServiceName("%sService");
//        mpg.setGlobalConfig(gc);
//
//        //创建数据源对象
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUrl("jdbc:mysql://192.168.183.141:3307/store?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai");
//        dsc.setUsername("root");
//        dsc.setPassword("123456");
//        dsc.setDbType(DbType.MYSQL);
//        mpg.setDataSource(dsc);
//
//        //包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.example");
//        Map<String,String> pathInfo = new HashMap<>();
//        pathInfo.put("entity_path", entity);
//        pathInfo.put("mapper_path", mapper);
//        pathInfo.put("xml_path", xml);
//        pathInfo.put("service_path", service);
//        pathInfo.put("service_impl_path", service_impl);
//        pathInfo.put("controller_path", controller);
//        pc.setPathInfo(pathInfo);
//        mpg.setPackageInfo(pc);
//        //策略配置
//        StrategyConfig sc = new StrategyConfig();
//        // 表名如果有下划线 需要转驼峰
//        sc.setNaming(NamingStrategy.underline_to_camel);
//        // 列名下划线转驼峰
//        sc.setColumnNaming(NamingStrategy.underline_to_camel);
//        // controller加RestController注解
//        sc.setRestControllerStyle(true);
//        // controller层类上生成地址
//        sc.setControllerMappingHyphenStyle(false);
//        // entity 加lombok注解
//        sc.setEntityLombokModel(true);
//        // 所有的entity 要继承 BaseEntity
//        sc.setSuperEntityClass(BaseEntity.class);
//        // 不再生成id
//        sc.setSuperEntityColumns("id");
//        //设置要生成的表名
//        sc.setInclude(table);
//        mpg.setStrategy(sc);
//        // 配置模板引擎
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
//        // 调用生成方法
//        mpg.execute();
        }
    }
}
