import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/devops")
public class DevOpsRoadmapServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>IT DevOps Roadmap</title>");
        out.println("<style>");
        out.println("body { font-family: Arial; margin: 40px; background-color: #f2f6fc; }");
        out.println("h1 { color: #2c3e50; }");
        out.println("h2 { color: #1abc9c; }");
        out.println("ul { line-height: 1.8; }");
        out.println(".container { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px #ccc; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");

        out.println("<h1>IT DevOps Roadmap</h1>");

        out.println("<h2>1. Programming Basics</h2>");
        out.println("<ul>");
        out.println("<li>Java / Python</li>");
        out.println("<li>Data Structures & OOP</li>");
        out.println("</ul>");

        out.println("<h2>2. Operating Systems</h2>");
        out.println("<ul>");
        out.println("<li>Linux Basics</li>");
        out.println("<li>Shell Scripting</li>");
        out.println("</ul>");

        out.println("<h2>3. Version Control</h2>");
        out.println("<ul>");
        out.println("<li>Git & GitHub</li>");
        out.println("</ul>");

        out.println("<h2>4. CI/CD Tools</h2>");
        out.println("<ul>");
        out.println("<li>Jenkins</li>");
        out.println("<li>GitHub Actions</li>");
        out.println("</ul>");

        out.println("<h2>5. Containers & Orchestration</h2>");
        out.println("<ul>");
        out.println("<li>Docker</li>");
        out.println("<li>Kubernetes</li>");
        out.println("</ul>");

        out.println("<h2>6. Cloud Platforms</h2>");
        out.println("<ul>");
        out.println("<li>AWS</li>");
        out.println("<li>Azure</li>");
        out.println("<li>Google Cloud</li>");
        out.println("</ul>");

        out.println("<h2>7. Infrastructure as Code</h2>");
        out.println("<ul>");
        out.println("<li>Terraform</li>");
        out.println("<li>Ansible</li>");
        out.println("</ul>");

        out.println("<h2>8. Monitoring & Logging</h2>");
        out.println("<ul>");
        out.println("<li>Prometheus</li>");
        out.println("<li>Grafana</li>");
        out.println("</ul>");

        out.println("<h2>9. DevOps Best Practices</h2>");
        out.println("<ul>");
        out.println("<li>Automation</li>");
        out.println("<li>Continuous Integration</li>");
        out.println("<li>Continuous Deployment</li>");
        out.println("<li>Security (DevSecOps)</li>");
        out.println("</ul>");

        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}