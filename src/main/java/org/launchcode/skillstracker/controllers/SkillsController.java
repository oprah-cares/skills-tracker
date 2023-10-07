package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    // handler that corresponds with localhost 8080
    @GetMapping("/")
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn, here is the list:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p> Click <a href='/form'>here</a> to select your favorite.</p>" +
                "</body>" +
                "</html>";
    }

    // handler that corresponds to localhost:8080/form to display form

    @GetMapping("/form")
    public String displaySkillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<label>Name</label>" +
                "<input type='text' name='userName' /><br />" +
                "<label>My favorite language</label>" +
                "<select name='fave1'>" +
                "<option value=''>Pick an option</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +

                "<label>My second favorite language</label>" +
                "<select name='fave2'>" +
                "<option value=''>Pick an option</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +

                "<label>My third favorite language</label>" +
                "<select name='fave3'>" +
                "<option value=''>Pick an option</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    // handler that corresponds to localhost:8080/form to display results
    @PostMapping("/form")
    public String processSkillsForm(@RequestParam String userName, String fave1, String fave2, String fave3){
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<h3>Favorite Languages</h3>" +
                "<ol>" +
                "<li>" + fave1 + "</li>" +
                "<li>" + fave2 + "</li>" +
                "<li>" + fave3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
