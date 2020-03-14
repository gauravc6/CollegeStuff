module x;

    reg D,A,B;
    wire y0,y1,y2,y3;
    dem d1(D,A,B,y0,y1,y2,y3);

    initial begin
        $display("D\tA\tB\tY0\tY1\tY2\tY3\n");
        $monitor("%b\t%b\t%b\t%b\t%b\t%b\t%b\t",D,A,B,y0,y1,y2,y3);
        D=1;
        A = 0;
        B = 0;
        #5
        A = 0;
        B = 1;
        #5
        A = 1;
        B = 0;
        #5
        A = 1;
        B = 1;
    end 

endmodule
