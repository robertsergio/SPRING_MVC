
package controller;

import config.Conexion;
import entity.Persona;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {
    
    Conexion con = new Conexion();
    JdbcTemplate template = new JdbcTemplate(con.conectar());
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;
    
    @RequestMapping("index.htm")
    public ModelAndView listar()
    {
       String sql = "select * from persona";
       datos = template.queryForList(sql);
       mav.addObject("lista", datos);
       mav.setViewName("index");
       return mav;
    }
    
    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView agregar()
    {
        mav.addObject(new Persona());
        mav.setViewName("agregar");
        return mav;
    }
    
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView agregar(Persona p)
    {
        String sql = "insert into persona(nombres,nacionalidad,correo) value(?,?,?)";
        this.template.update(sql, p.getNombres(), p.getNacionalidad(), p.getCorreo());
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView editar(HttpServletRequest request)
    {
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from persona where id = " + id;
        datos = template.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("editar");
        return mav;
    }
    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView editar(Persona p)   
    {
        String sql = "update persona set nombres=?, nacionalidad=?, correo=? where  id =? ";
        template.update(sql, p.getNombres(), p.getNacionalidad(), p.getCorreo(),id);
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping("delete.htm")
    public ModelAndView delete(HttpServletRequest request){
        id = Integer.parseInt( request.getParameter("id"));
        String sql = "delete from persona where id = "+id;
        template.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }
}
