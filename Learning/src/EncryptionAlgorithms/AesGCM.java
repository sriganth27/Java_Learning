package EncryptionAlgorithms;

import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;


public class AesGCM {

	public static void main(String[] args) throws Exception{
		String plainText = "Hello World";
		String key = "mySecret";
		SecretKey sp = generateKey(key);
		byte[] iv = new byte[16];
		new SecureRandom().nextBytes(iv);;
		String scp = encrypt(plainText,sp,iv);
		System.out.println(scp);
		String dcp = decrypt(scp,sp);
		System.out.println(dcp);

	}

	private static String decrypt(String scp, SecretKey sp) throws Exception{
		// TODO Auto-generated method stub
		Cipher cp = Cipher.getInstance("AES/GCM/NoPadding");
		byte [] arr = Base64.getDecoder().decode(scp);
		byte [] ivVal = Arrays.copyOfRange(arr, 0, 16);
		byte [] encVal = Arrays.copyOfRange(arr, 16, arr.length);
		GCMParameterSpec gc =  new GCMParameterSpec(128, ivVal);
		cp.init(Cipher.DECRYPT_MODE, sp,gc);
		
		String str = new String(cp.doFinal(encVal));
		return str;
	}

	private static String encrypt(String data, SecretKey sp, byte[] iv) throws Exception{
		// TODO Auto-generated method stub
		Cipher cp = Cipher.getInstance("AES/GCM/NoPadding");
		GCMParameterSpec gcm = new GCMParameterSpec(128,iv);
		cp.init(Cipher.ENCRYPT_MODE, sp,gcm);
		byte [] bt =cp.doFinal(data.getBytes());
		byte[] result = new byte[bt.length +iv.length];
		System.arraycopy(iv, 0, result, 0, iv.length);
		System.arraycopy(bt, 0, result, iv.length, bt.length);

		//System.arraycopy(source, sourcePos,
               // destination, destPos,
               // length);
		return Base64.getEncoder().encodeToString(result);
	}

	private static SecretKey generateKey(String key) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		MessageDigest mg = MessageDigest.getInstance("SHA-256");
		byte [] bt =mg.digest(key.getBytes(StandardCharsets.UTF_8));
		bt = Arrays.copyOf(bt, 16);
		System.out.println(Base64.getEncoder().encodeToString(bt));
		return new SecretKeySpec(bt, "AES");
	}

}
