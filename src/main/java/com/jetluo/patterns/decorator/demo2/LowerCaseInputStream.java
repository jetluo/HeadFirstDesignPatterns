package com.jetluo.patterns.decorator.demo2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName LowerCaseInputStream
 * @Description TODO
 * @Author jet
 * @Date 2022/6/2 16:15
 * @Version 1.0
 **/
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off;i < off+result;i++){
            b[i]= (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c :Character.toLowerCase((char)c));
    }
}
