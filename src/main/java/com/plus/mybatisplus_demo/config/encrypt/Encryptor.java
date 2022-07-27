package com.plus.mybatisplus_demo.config.encrypt;
import lombok.extern.slf4j.Slf4j;
import mybatis.mate.annotation.Algorithm;
import mybatis.mate.encrypt.IEncryptor;
import org.apache.ibatis.reflection.MetaObject;

/**
 * @author YZ
 * @date 2022/7/22 0022
 * @apiNote
 */
@Slf4j
public class Encryptor implements IEncryptor {

    /**
     * 加密
     *
     * @param algorithm  算法
     * @param password   密码（对称加密算法密钥）
     * @param publicKey  非对称加密算法（公钥）
     * @param metaObject {@link org.apache.ibatis.reflection.MetaObject}
     * @return
     */
    @Override
    public String encrypt(Algorithm algorithm, String password, String publicKey,
            Object metaObject) {
        log.info("password,{},publicKey:{}",password,publicKey);
        if (metaObject instanceof MetaObject) {
            MetaObject _metaObject = ((MetaObject) metaObject);
            // 获取待加密对象 name 属性值，注意 src 是注解属性值框架层已经取出来了，这里是查询行对象任意值获取
            _metaObject.getValue("name");
        }
        return "加密返回";
    }

    /**
     * 解密
     *
     * @param algorithm  算法
     * @param password   密码（对称加密算法密钥）
     * @param privateKey 非对称加密算法（私钥）
     * @param metaObject {@link org.apache.ibatis.reflection.MetaObject}
     * @return
     */
    @Override
    public String decrypt(Algorithm algorithm, String password, String privateKey,
             Object metaObject) {
        if (metaObject instanceof MetaObject) {
            MetaObject _metaObject = ((MetaObject) metaObject);
            // 获取待解密对象 name 属性值，注意 encrypt 是注解属性值框架层已经取出来了，这里是查询行对象任意值获取
            _metaObject.getValue("name");
        }
        return "解密返回";
    }


}
