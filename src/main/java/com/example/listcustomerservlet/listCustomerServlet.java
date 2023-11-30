package com.example.listcustomerservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "listCustomerServlet", urlPatterns = "/customers")
public class listCustomerServlet extends HttpServlet {
    ArrayList<Customer> customers = new ArrayList<>();
    public void init(){
        Customer customer = new Customer("1","long", "12-1-1999","thanh hoa");
        Customer customer1 = new Customer("2","tuan", "1-10-1998","ha noi");
        Customer customer2 = new Customer("3","son", "7-6-1995","ha nam");
        Customer customer3 = new Customer("4","minh", "13-6-1997","long bien");
        Customer customer4 = new Customer("5","huan", "9-5-1994","nam dinh");
        Customer customer5 = new Customer("6","trung", "19-8-1999","nghe an");
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customers" , customers);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/customerList.jsp");
        dispatcher.forward(req,resp);
    }
}
