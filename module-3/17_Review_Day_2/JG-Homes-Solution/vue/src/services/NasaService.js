import axios from "axios";

const api_key = '?api_key=Gt53JZCtJPHVfecMOgQg4n0fRAW64TBPBrydnl4W';

export default {

    getNasaInformation() {
        return axios.get('https://api.nasa.gov/planetary/apod' + api_key);
    }


}