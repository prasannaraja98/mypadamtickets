package movies;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

 

@Controller
public class MoviesController {
        @RequestMapping("/master")
        
        public ModelAndView master() {
            
            return new ModelAndView("master");
        }
        
        @RequestMapping("/kong")
        
        public ModelAndView kong() {
            
            return new ModelAndView("kongvszilla");
        }
        
        
        @RequestMapping("/mangatha")
        
        public ModelAndView mankatha() {
            
            return new ModelAndView("mangatha");
        }

 

       @RequestMapping("/sooraraipotru")
            
       public ModelAndView sooraraiPotru() {
                
       return new ModelAndView("sooraraipotru");
            }

 

        
        
        @RequestMapping("/masterseats")
        public ModelAndView seats() {
        //user has chosen master
            return new ModelAndView("seats"); //master
        }
     
        @RequestMapping("/zillaseats")
        public ModelAndView zilla() {
        //user has chosen master
            return new ModelAndView("zillaseats"); //kong
        }
       
        @RequestMapping("/mangathaseats")
        public ModelAndView mangatha() {
        //user has chosen master
            return new ModelAndView("mangathaseats"); //kong
        }
       
        @RequestMapping("/sooraraipotruseats")
        public ModelAndView sooraraipotru() {
        //user has chosen master
            return new ModelAndView("sooraraipotruseats"); //kong
        }
       
}