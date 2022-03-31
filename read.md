# @Autowired
@Autowired是按类型自动转配的，不支持id匹配。
需要导入 spring-aop的包！

# @Qualiﬁer
@Autowired是根据类型自动装配的，加上@Qualiﬁer则可以根据byName的方式自动装配
@Qualiﬁer不能单独使用。

# @Resource
@Resource如有指定的name属性，先按该属性进行byName方式查找装配；
其次再进行默认的byName方式进行装配；
如果以上都不成功，则按byType的方式自动装配。
都不成功，则报异常。

# @Autowired与@Resource异同：
1. @Autowired与@Resource都可以用来装配bean。都可以写在字段上，或写在setter方法上。
2. @Autowired默认按类型装配（属于spring规范），默认情况下必须要求依赖对象必须存在，如果
要允许null 值，可以设置它的required属性为false，如：@Autowired(required=false) ，如果我
们想使用名称装配可以结合@Qualiﬁer注解进行使用
3. @Resource（属于J2EE复返），默认按照名称进行装配，名称可以通过name属性进行指定。如果
没有指定name属性，当注解写在字段上时，默认取字段名进行按照名称查找，如果注解写在
setter方法上默认取属性名进行装配。 当找不到与名称匹配的bean时才按照类型进行装配。但是
需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。
它们的作用相同都是用注解方式注入对象，但执行顺序不同。@Autowired先byType，@Resource先
byName。
