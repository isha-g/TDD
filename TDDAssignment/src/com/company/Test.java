package com.company;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class Test {

    @Mock
    FileInput file;
    OddOrEven a;
    OddOrEven a1;

    @Spy
    FileInput file1;

    @Before
    public void setUp() throws Exception{
        file= mock(FileInput.class);
        a=new OddOrEven();
        a.setReadObject(file);

        a1=new OddOrEven();
        file1=spy(new FileInput());
        a1.setReadObject(file1);

        System.out.println("This is executed before ");
    }

    @org.junit.Test
    public void changeOnAccess() throws Exception{
        file= mock(FileInput.class);
        a=new OddOrEven();
        a.setReadObject(file);
        when(file.FileInput(anyString())).thenReturn(10);
        boolean answer= OddOrEven.checkeo();
        verify(file).FileInput(anyString());
    }

    @org.junit.Test
    public void checkEven() throws Exception{
        file= mock(FileInput.class);
        a=new OddOrEven();
        a.setReadObject(file);
        when(file.FileInput(anyString())).thenReturn(10);
        boolean answer= OddOrEven.checkeo();
        assertTrue(answer);
    }

    @org.junit.Test
    public void checkOdd() throws Exception{
        a1=new OddOrEven();
        file1=spy(new FileInput());
        a1.setReadObject(file1);
        doReturn(9).when(file1).FileInput(anyString());
        boolean answer=OddOrEven.checkeo();
        assertFalse(answer);
    }
}
