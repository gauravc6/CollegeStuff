module x;

    reg x,y,z;
    wire fsum,c;
    fullAdd fa(.x(x),.y(y),.z(z),.fsum(fsum),.c(c));

    initial begin
        $display("x\ty\tz\tSum\tCarry");
        $monitor("%b\t%b\t%b\t%b\t%b\t",x,y,z,fsum,c);
        x=0;
        y=0;
        z=0;
        #5
        x=0;
        y=0;
        z=1;
        #5
        x=0;
        y=1;
        z=0;
        #5
        x=0;
        y=1;
        z=1;
        #5
        x=1;
        y=0;
        z=0;
        #5
        x=1;
        y=0;
        z=1;
        #5
        x=1;
        y=1;
        z=0;
        #5
        x=1;
        y=1;
        z=1;
    end
    
endmodule
