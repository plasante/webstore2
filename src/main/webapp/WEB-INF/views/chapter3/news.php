<?php
/**
 * Created by PhpStordegradualser: forest
 * Date: 14/11/10
 * Time: 1:27 AM
 */

if ($_GET['func'] && $_GET['func'] === 'getNews') {
    getNews();
}

function getNews() {

    $data = array(
        0 => make_news_item(array(
            'title' => 'Why we love coffee',
            'subTitle'=>'Reasons to enjoy',
            'intro'=>'<p>We love coffee because its awesome</p>',
            'body' => '<p></p>',
            'date' => '2015-05-10',
            'images' => array(
                'main' => 'img/001',
                'thumb' => 'img/thumbs/001.jpg'
            )
        )),
        1 => make_news_item(array(
            'title' => 'Does coffee make you smarter?',
            'subTitle'=>'Reasons to enjoy',
            'intro'=>'<p>Recent studies have show that anything is possible</p>',
            'body' => '<p></p>',
            'date' => '2015-05-10',
            'images' => array(
                'main' => 'img/001',
                'thumb' => 'img/thumbs/002.jpg'
            )
        )),
        2 => make_news_item(array(
            'title' => 'Pre-ground or Beans',
            'subTitle'=>'Reasons to enjoy',
            'intro'=>'<p>To buy ground or to grind!</p>',
            'body' => '<p></p>',
            'date' => '2015-05-10',
            'images' => array(
                'main' => 'img/001',
                'thumb' => 'img/thumbs/003.jpg'
            )
        )),
        3 => make_news_item(array(
            'title' => 'Plunge it!',
            'subTitle'=>'Reasons to enjoy',
            'intro'=>'<p>What makes a plunged coffee delicious?</p>',
            'body' => '<p></p>',
            'date' => '2015-05-10',
            'images' => array(
                'main' => 'img/001',
                'thumb' => 'img/thumbs/004.jpg'
            )
        )),
        4 => make_news_item(array(
            'title' => 'How to skim your plunger',
            'subTitle'=>'Reasons to enjoy',
            'intro'=>'<p>Skimming might prevent excess coffee</p>',
            'body' => '<p></p>',
            'date' => '2015-05-10',
            'images' => array(
                'main' => 'img/001',
                'thumb' => 'img/thumbs/005.jpg'
            )
        )),
        5 => make_news_item(array(
            'title' => 'Baristas!',
            'subTitle'=>'Reasons to enjoy',
            'intro'=>'<p>Fancy yourself a barista?</p>',
            'body' => '<p></p>',
            'date' => '2015-05-10',
            'images' => array(
                'main' => 'img/001',
                'thumb' => 'img/thumbs/006.jpg'
            )
        )),
        6 => make_news_item(array(
            'title' => 'Flavours',
            'subTitle'=>'Reasons to enjoy',
            'intro'=>'<p>Irish cream and all sorts of nuts</p>',
            'body' => '<p></p>',
            'date' => '2015-05-10',
            'images' => array(
                'main' => 'img/001',
                'thumb' => 'img/thumbs/007.jpg'
            )
        )),
    );

    header('Content-Type: application/json');
    echo json_encode($data);
}

function make_news_item($data) {
    $news = new stdClass();
    $news->title = $data['title'];
    $news->subTitle = $data['subTitle'];
    $news->intro = $data['intro'];
    $news->body = $data['body'];
    $news->date = $data['date'];
    $news->images = $data['images'];
    return $news;
}