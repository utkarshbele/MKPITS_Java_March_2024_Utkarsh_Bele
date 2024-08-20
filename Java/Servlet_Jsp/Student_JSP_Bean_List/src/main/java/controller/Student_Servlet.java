package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import SttudentModel.Student;
import SttudentModel.StudentDAO;

/**
 * Servlet implementation class Student_Servlet
 */

@WebServlet("/")
public class Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StudentDAO sDAO=null;
       RequestDispatcher rDispatcher = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_Servlet() {
        super();
        sDAO= new StudentDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 String action = request.getServletPath();

	        try {
	            switch (action) {
	                case "/new":
	                    newStudentForm(request, response);
	                    break;
	                case "/insert":
	                    insertStudent(request, response);
	                    break;
	                case "/delete":
	                    deleteStudent(request, response);
	                    break;
	                case "/edit":
	                    editStudentForm(request, response);
	                    break;
	                case "/update":
	                    updateStudent(request, response);
	                    break;
	                default:
	                	listStudents(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	private void listStudents(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
		        ArrayList < Student > listStudent = sDAO.selectAllStudents();
		        request.setAttribute("listStudents", listStudent);
		        rDispatcher = request.getRequestDispatcher("student_list.jsp");
		        rDispatcher.forward(request, response);
		    }
	
	
	private void newStudentForm(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        RequestDispatcher dispatcher = request.getRequestDispatcher("student-form.jsp");
		        dispatcher.forward(request, response);
		    }
	
	
	private void insertStudent(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
		        String name= request.getParameter("name");
		        String percentage = request.getParameter("percentage");
		        String address= request.getParameter("address");
		        String city= request.getParameter("city");
		        String country= request.getParameter("country");
		        Student newStudent = new Student(name,Double.parseDouble(percentage),address,city,country);
		        sDAO.insertStudent(newStudent);
		        response.sendRedirect("listStudents");
		    }
	
	private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
				int id = Integer.parseInt(request.getParameter("id"));
		        sDAO.deleteStudentById(id);
		        response.sendRedirect("listStudents");
		    }
	
	
	private void editStudentForm(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
				int id=Integer.parseInt(request.getParameter("id"));
				Student curr_student = sDAO.getStudentById(id);
				request.setAttribute("student", curr_student);
		        rDispatcher = request.getRequestDispatcher("student-form.jsp");
		        rDispatcher.forward(request, response);
		    }
	
	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
				int id=Integer.parseInt(request.getParameter("id"));
				String name= request.getParameter("name");
			    String percentage = request.getParameter("percentage");
			    String address= request.getParameter("address");
			    String city= request.getParameter("city");
			    String country= request.getParameter("country");
		        Student newStudent = new Student(id, name,Double.parseDouble(percentage),address,city,country);
		        sDAO.updateStudent(newStudent);
		        response.sendRedirect("listStudents");
		    }
}
