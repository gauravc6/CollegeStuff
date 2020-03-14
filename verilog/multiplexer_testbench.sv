module x;

    reg d0,d1,d2,d3,A,B;
    wire y;
    mux m1(.d0(d0),.d1(d1),.d2(d2),.d3(d3),.A(A),.B(B),.y(y));

    initial begin
        $display("d0\td1\td2\td3\tA\tB\tOutput\n");
        $monitor("%b\t%b\t %b\t %b\t %b\t%b\t%b",d0,d1,d2,d3,A,B,y);
        d0=1;
        d1=0;
        d2=0;
        d3=0;
        A=0;
        B=0;
        #5
        d0=0;
        d1=1;
        d2=0;
        d3=0;
        A=0;
        B=1;
        #5
        d0=0;
        d1=0;
        d2=1;
        d3=0;
        A=1;
        B=0;
        #5
        d0=0;
        d1=0;
        d2=0;
        d3=1;
        A=1;
        B=1;
    end 

endmodule
