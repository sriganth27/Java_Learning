package EncryptionAlgorithms;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AesCBC implements Cloneable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String plainText =
				"{\"customerId\":\"12345\",\"accountNumber\":\"9876543210\",\"amount\":1000}";
		String key = "mySecretKey";
		MessageDigest mg = MessageDigest.getInstance("SHA-256");
		byte [] bt = mg.digest(key.getBytes(StandardCharsets.UTF_8));
		bt = Arrays.copyOf(bt, 16);
		String aesKey = Base64.getEncoder().encodeToString(bt);
		SecretKeySpec sp = new SecretKeySpec(bt, "AES");
		byte [] iv = new byte[16];
		new SecureRandom().nextBytes(iv);
		System.out.println(Base64.getEncoder().encodeToString(iv));
		System.out.println(Arrays.toString(iv));
		System.out.println(aesKey);
		String encrypt = encryption(plainText,sp,iv);
		System.out.println("encrypted value is "+encrypt);
		System.out.println("length "+encrypt.length() );
		String decrypt = decryption(encrypt,sp,iv);
		System.out.println("decrypted values is "+decrypt);
	}

	private static String decryption(String data, SecretKeySpec key, byte[] iv) throws Exception{
		// TODO Auto-generated method stub
		Cipher cp = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cp.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
		System.out.println(new String(cp.doFinal(Base64.getDecoder().decode(data))));
		return new String(cp.doFinal(Base64.getDecoder().decode(data)));
	}

	private static String encryption(String data, SecretKeySpec key, byte[] iv) throws Exception {
		// TODO Auto-generated method stub
		//Step 1:
		Cipher cp = Cipher.getInstance("AES/CBC/PKCS5Padding");
		//Step 2:
		cp.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(iv));
		//Step 3:
		byte [] bt = cp.doFinal(data.getBytes());
		return Base64.getEncoder().encodeToString(bt);
	}

}
