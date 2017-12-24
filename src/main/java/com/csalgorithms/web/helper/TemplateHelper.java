package com.csalgorithms.web.helper;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

public class TemplateHelper {

    /**
     * Initialize required parameter for the view template
     * @param model
     * @param path
     * @return index page
     */
    public static String view(Model model, String ... path) {
        if(path.length == 0) {
            throw new RuntimeException("Path cannot be empty");
        }

        // If a directory path is specified
        if(path.length > 1) {
            StringBuilder pathBuilder = new StringBuilder();
            for(int i=0; i < path.length-1; i++) {
                pathBuilder.append(path[i]);
                pathBuilder.append("/");
            }
            model.addAttribute("main_page_dir", pathBuilder.toString());
        }

        // Add file name
        model.addAttribute("main_page_file", path[path.length-1]);

        // Get the default index file
        return "index";
    }
}
