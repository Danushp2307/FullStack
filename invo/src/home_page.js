import sample from "./assets/videoplayback_Trim.mp4"
import './home.css';
function Home() {
    return (
        <body>
            <video autoPlay muted loop id="myVideo">
                <source src={sample} type="video/mp4" />
                <div className="logo"></div>
            </video>
        </body>
    )
}

export default Home;